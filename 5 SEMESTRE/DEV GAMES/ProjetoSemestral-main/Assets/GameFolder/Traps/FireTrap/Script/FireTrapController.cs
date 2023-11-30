using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class FireTrapController : MonoBehaviour
{

    public AudioClip fireAudio;
    public AudioSource v_AudioSource;
    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        
    }

    private void OnTriggerEnter2D(Collider2D collision)
    {
        if (collision.CompareTag("Player"))
        {
            collision.GetComponent<Character>().PlayerDamage(1);
        }
    }

    public void firePlay(){
        v_AudioSource.PlayOneShot(fireAudio, 1);
    }

}
