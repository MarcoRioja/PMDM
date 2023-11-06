using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class MovePlayer : MonoBehaviour
{
    // Start is called before the first frame update
    public float despHor;
    public float speed = 10f;
    public GameObject proyectilPref;
    void Start()
    {
        Debug.Log("estas comenzando el juego");
    }

    // Update is called once per frame
    void Update()
    {
        if (Input.GetKeyDown(KeyCode.Space))
        {
            //ahora vamos a realizar instancias o copias del prefab que hemos creado
            //transformm position accedemos a la misma
            //posicion del jugador. con proyectilprefb.transror.rotation le decimos que no queremos ninguna rotacion
            Instantiate(proyectilPref, transform.position,
                proyectilPref.transform.rotation);

        }


        if (transform.position.x < -15)
        {
            transform.position = new Vector3(-15, transform.position.y, transform.position.z);
        }
        if (transform.position.x > 15)
        {
            transform.position = new Vector3(15, transform.position.y, transform.position.z);
        }

        despHor = Input.GetAxis("Horizontal");
        //Mover al jugarod horizontalmente
        transform.Translate(Vector3.right * despHor * Time.deltaTime * speed);

    }
}

