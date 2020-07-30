import React, { useState, useEffect } from 'react'
import Axios from 'axios'

function Create() {

    const url1 = 'http://localhost:8080/newUser'
    const [airman, setAirman] = useState(null)

    useEffect(() => {
         Axios.post(url1)
            .then(response => {
                setAirman(response.data)
                console.log(setAirman)
    })
    }, [url1])

    const url2 = 'http://localhost:8080/newRecord'
    const [record, setRecord] = useState(null)

    useEffect(() => {
        Axios.post(url2)
            .then(response => {
                setRecord(response.data)
                console.log(setRecord)
    }) 
    }, [url2])


    return (

      <div> Create place holder</div>  
    ) 
}

export default Create