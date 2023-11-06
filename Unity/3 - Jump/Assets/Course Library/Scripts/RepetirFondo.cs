using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class RepetirFondo : MonoBehaviour
{
    private Vector3 posInicio;
    private float anchoRepeticion;
    void Start()
    {
        posInicio = transform.position;
        anchoRepeticion = GetComponent<BoxCollider>().size.x/2;
    }

  
    void Update()
    {
        if (transform.position.x<posInicio.x-50) {
            transform.position = posInicio;
        
        }

    }
}
