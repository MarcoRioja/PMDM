using System.Collections.Generic;
using UnityEngine;

public class Generator : MonoBehaviour
{
    public GameObject[] animalsPref;
    private float xPos1 = 15;
    private float xPos2 = 15;
    private float startGen = 2.0f;
    private float pauseGen = 1.5f;

    void Start()
    {
        InvokeRepeating("RandomGenerator", startGen, pauseGen);
    }

    void RandomGenerator()
    {
        int a = Random.Range(0, animalsPref.Length);
        Vector3 generatorPosition = new Vector3(Random.Range(-xPos1, xPos2), 0, 20);
        Instantiate(animalsPref[a], generatorPosition, animalsPref[a].transform.rotation);
    
    }
}

