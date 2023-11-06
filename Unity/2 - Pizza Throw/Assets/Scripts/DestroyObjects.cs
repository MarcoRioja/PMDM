using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class DestroyObjects : MonoBehaviour
{
    // Start is called before the first frame update
    float upLimit = 25;
    float downLimit = -10;

    void Start()

    {
        
    }

    // Update is called once per frame
    void Update()
    {
        if (transform.position.z > upLimit)
        {
            Destroy(gameObject);
        } 
            else if(transform.position.z < downLimit)
        {
            Destroy(gameObject);
        }

    }
}
