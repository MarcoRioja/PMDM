using System.Collections;
using System.Collections.Generic;
using Unity.VisualScripting;
using UnityEngine;

public class Generation : MonoBehaviour
{
    // Start is called before the first frame update
    public GameObject prefabEnemigo;
    private float rangoGeneracion = 9.0f;
    public int numeroEnemigos;
    public int numeroOleada=1;
    public GameObject prefabPowerUp;
    void Start()
    {

        GeneradorEnemigos(numeroOleada);
        Instantiate(prefabPowerUp, DamePosicionGeneracion(), prefabPowerUp.transform.rotation);
    }

    // Update is called once per frame
    void Update()
    {
        numeroEnemigos = FindObjectsOfType<Enemy>().Length;
        if (numeroEnemigos == 0) {
            numeroOleada++;
            GeneradorEnemigos(numeroOleada);
            Instantiate(prefabPowerUp, DamePosicionGeneracion(), prefabPowerUp.transform.rotation);
        }
    }
    Vector3 DamePosicionGeneracion() {
        float posXGeneracion = Random.Range(-rangoGeneracion, rangoGeneracion);
        float posYGeneracion = Random.Range(-rangoGeneracion, rangoGeneracion);
        Vector3 posAleatoria = new Vector3(posXGeneracion, 0, posYGeneracion);
        return posAleatoria;
    }
    void GeneradorEnemigos(int enemigos) {
        for (int i = 0; i < enemigos; i++)
        {
            Instantiate(prefabEnemigo, DamePosicionGeneracion(), prefabEnemigo.transform.rotation);
        }
       
    }
}
