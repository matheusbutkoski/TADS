using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;
using UnityEngine.UI;

public class menu : MonoBehaviour
{
    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        
    }

    public void newGame(){
        SceneManager.LoadScene("Fase1");
    }

    public void exitGame(){
        Application.Quit();
    }

    public void BackMenu(){
        SceneManager.LoadScene("Menu");
    }
}
