using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class RotateCamera : MonoBehaviour
{
    // Start is called before the first frame update
    public float velocidadRotacion = 50;
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        float entradaHorizontal = Input.GetAxis("Horizontal");


        transform.Rotate(Vector3.up,velocidadRotacion*Time.deltaTime*entradaHorizontal);


    }
}
