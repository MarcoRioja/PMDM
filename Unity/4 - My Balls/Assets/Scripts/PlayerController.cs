using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PlayerController : MonoBehaviour
{
    // Start is called before the first frame update
    private Rigidbody rbJugador;
    private GameObject puntoEnfoque;
    public bool tienePowerUp;
    public float velocidad = 0.5f;
    private float fuerzaPowerUp = 15.0f;
    public GameObject indicadorPowerUp; 
    void Start()
    {
        rbJugador = GetComponent<Rigidbody>();
        puntoEnfoque = GameObject.Find("Punto de Enfoque");

    }

    // Update is called once per frame
    void Update()
    {
        float entradaAvance = Input.GetAxis("Vertical");
        float entradaLateral = Input.GetAxis("Horizontal");
        
        // de esta manera ser� el punto de enfoque hacia adelante lo que cambiar�  y se mover� la camara
        //tambien hacia adelante
        rbJugador.AddForce(puntoEnfoque.transform.forward * entradaAvance*velocidad);
        rbJugador.AddForce(puntoEnfoque.transform.right * entradaLateral * velocidad);
        // el vector3 es para que el indicador baje al suelo
        //esta linea igual el indicador y sigue al jugador.
        indicadorPowerUp.transform.position = transform.position + new Vector3(0, -0.5f, 0);
    }
    private void OnTriggerEnter(Collider other)
    {
        if (other.CompareTag("PowerUp")) {

            tienePowerUp = true;
            Destroy(other.gameObject);
            Debug.Log("ha cogido PowerUp");
            indicadorPowerUp.gameObject.SetActive(true);
            StartCoroutine(RutinaTemporizadorPowerUp());
        } 
    }
    private void OnCollisionEnter(Collision collision)
    {
        if (collision.gameObject.CompareTag("Enemigo")&& tienePowerUp) {
            Rigidbody rbEnemigo = collision.gameObject.GetComponent<Rigidbody>();
            Vector3 lanzarEnemigo = (collision.gameObject.transform.position -
                transform.position);
            rbEnemigo.AddForce(lanzarEnemigo * fuerzaPowerUp, ForceMode.Impulse);

            Debug.Log(" el jugador ha chocado contra" +
                collision.gameObject + " con power up "+tienePowerUp);
        
        }

    }
    IEnumerator RutinaTemporizadorPowerUp() {
        yield return new WaitForSeconds(7);
        Debug.Log("han pasado los siete segundo de tu powerup");
        indicadorPowerUp.gameObject.SetActive(false);
        tienePowerUp = false;
    }

}
