using UnityEngine;

public class Enemy : MonoBehaviour
{
    // Start is called before the first frame update
    private Rigidbody rbEnemigo;
    private GameObject jugador;
    public float velocidad = 0.1f;
    void Start()
    {

        rbEnemigo = GetComponent<Rigidbody>();
        jugador = GameObject.Find("Jugador");
    }

    // Update is called once per frame
    void Update()
    {
        Vector3 vectorAlObjetivo = (jugador.transform.position - transform.position).normalized;
        rbEnemigo.AddForce(vectorAlObjetivo * (velocidad)/2);
        if (transform.position.y < -10) {
            Destroy(gameObject);
        }

    }
}

