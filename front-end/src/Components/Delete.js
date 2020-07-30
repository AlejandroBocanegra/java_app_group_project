import React, { useState, useEffect } from 'react'
import Axios from 'axios'

function Delete() {

    const url1 = 'http://localhost:8080/deleteUser/'
    const [airman, setAirman] = useState(null)

    useEffect(() => {
         Axios.delete(url1)
            .then(response => {
                setAirman(response.data)
                console.log(setAirman)
    })
    }, [url1])

    const url2 = 'http://localhost:8080/deleteRecord/'
    const [record, setRecord] = useState(null)

    useEffect(() => {
        Axios.delete(url2)
            .then(response => {
                setRecord(response.data)
                console.log(setRecord)
    }) 
    }, [url2])


    return (

      <div> Delete place holder</div>  
    ) 
}

export default Delete