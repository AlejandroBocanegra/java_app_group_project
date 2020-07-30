import React, { useState, useEffect } from 'react'
import Axios from 'axios'

function List() {

    const url1 = 'http://localhost:8080/viewUser/'
    const [airman, setAirman] = useState(null)

    useEffect(() => {
         Axios.get(url1)
            .then(response => {
                setAirman(response.data)
                console.log(setAirman)
    })
    }, [url1])

    const url2 = 'http://localhost:8080/viewRecord'
    const [record, setRecord] = useState(null)

    useEffect(() => {
        Axios.get(url2)
            .then(response => {
                setRecord(response.data)
                console.log(setRecord)
    }) 
    }, [url2])


    return (

      <div> List place holder</div>  
    ) 
}

export default List