using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class MoverIzquierda : MonoBehaviour
{
    private float velocidad = 15f;
    private float limiteIzquierdo = -15;
    private ControlJugador ScriptControlJugador;
    void Start()
    {
       ScriptControlJugador = GameObject.Find("Jugador").GetComponent<ControlJugador>();
    }

    void Update()
    {

        if (ScriptControlJugador.gameOver==false) { 
         transform.Translate(Vector3.left * velocidad * Time.deltaTime);
        }
        if (transform.position.x < limiteIzquierdo &&
        gameObject.CompareTag("Obstaculo")) {
            Destroy(gameObject);
        }


    }
}
