using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ControlGenerador : MonoBehaviour
{
    [SerializeField]
    private GameObject prefabObstaculo;
    private Vector3 posicionGenerador = new Vector3(25, 0, 0);
    private float tiempoRetraso = 2;
    private float intervaloRepeticion = 2;
    private ControlJugador scriptControlJugador;
    void Start()
    {
        scriptControlJugador = GameObject.Find("Jugador").GetComponent<ControlJugador>();
        InvokeRepeating("GenerarObstaculo", tiempoRetraso, intervaloRepeticion);

    }

    void Update()
    {
        
    }
    void GenerarObstaculo() {
        if (scriptControlJugador.gameOver == false) {
            Instantiate(prefabObstaculo, posicionGenerador, prefabObstaculo.transform.rotation);
        }

       

    }
}


