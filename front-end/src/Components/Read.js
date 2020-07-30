import React, { useState, useEffect } from 'react'
import Axios from 'axios'

function Read() {

    const url1 = 'http://localhost:8080/viewAllUsers'
    const [airman, setAirman] = useState(null)

    let airmanInfo = null;

    useEffect(() => {
         Axios.get(url1)
            .then(response => {
                setAirman(response.data)
                console.log(setAirman)
            })
    }, [url1])

    const url2 = 'http://localhost:8080/viewAllRecords'
    const [record, setRecord] = useState(null)

    let recordInfo = null;

    useEffect(() => {
        Axios.get(url2)
            .then(response => {
                setRecord(response.data)
                console.log(setRecord)
            })
    }, [url2])

    if (airman && record) {
        airmanInfo =
        <div>
            <h1>{airman.firstName}</h1>
        </div>

        recordInfo =
        <div>
            <h1>{record.hivCheckLast}</h1>
        </div>
    }

    return (
        <div> 
            {airmanInfo}
            {recordInfo}
        </div>  
    )
}

export default Read