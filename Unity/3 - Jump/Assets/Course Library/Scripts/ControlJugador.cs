using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ControlJugador : MonoBehaviour
{
    // Start is called before the first frame update
    private Rigidbody rbJugador;
    public float fuerzaSalto = 10;
    [SerializeField]
    private float modificadorGravedad = 2;
    [SerializeField]
    private bool estarSuelo = true;
    public bool gameOver;
    private Animator animacionJugador;
    public ParticleSystem explosion;
    public ParticleSystem polvareda;
    void Start()
    {
       
        rbJugador = GetComponent<Rigidbody>();
        Physics.gravity *= modificadorGravedad;
        animacionJugador = GetComponent<Animator>();
    }

    void Update()
    {
        if (Input.GetKeyDown(KeyCode.Space) && estarSuelo && !gameOver)
        {

          
            rbJugador.AddForce(Vector3.up * fuerzaSalto, ForceMode.Impulse);
            estarSuelo = false;
            animacionJugador.SetTrigger("Jump_trig"); 
            polvareda.Stop();
        }

    }
    private void OnCollisionEnter(Collision collision)
    {
        if (collision.gameObject.CompareTag("Suelo"))
        {
            estarSuelo = true;
            polvareda.Play();
        }
        else if (collision.gameObject.CompareTag("Obstaculo"))
        {
            
            Debug.Log("GAME OVER"); 
            gameOver = true;
            animacionJugador.SetBool("Death_b", true);
            animacionJugador.SetInteger("DeathType_int", 1);
            explosion.Play();
            polvareda.Stop();
            
        }
    }

}


