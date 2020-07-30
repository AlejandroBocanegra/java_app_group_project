import React, { useState, useEffect } from 'react'
import Axios from 'axios'

function Update() {

    const url1 = 'http://localhost:8080/updateUser/'
    const [airman, setAirman] = useState(null)

    useEffect(() => {
         Axios.put(url1)
            .then(response => {
                setAirman(response.data)
                console.log(setAirman)
    })
    }, [url1])

    const url2 = 'http://localhost:8080/updateRecord/'
    const [record, setRecord] = useState(null)

    useEffect(() => {
        Axios.put(url2)
            .then(response => {
                setRecord(response.data)
                console.log(setRecord)
    }) 
    }, [url2])


    return (

      <div> Update place holder</div>  
    ) 
}

export default Update