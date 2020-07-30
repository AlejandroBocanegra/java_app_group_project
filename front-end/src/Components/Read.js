import React, { Fragment, useEffect, useState } from 'react'
//import Create from "./Create"

//Form Submit Handeling
const Read = () => {

    const [airman, setAirman] = useState([]);
    const [record, setRecord] = useState([]);

    const getInfo = async () => {

        try {
            //Amn Table
           const response = await fetch("http://localhost:8080/viewAllUsers");
           const amnJsonData = await response.json();

           setAirman(amnJsonData);
           console.log(amnJsonData);

           //Record Table
           const response2 = await fetch("http://localhost:8080/viewAllRecords");
           const recordJsonData = await response2.json();

           setRecord(recordJsonData);
           console.log(recordJsonData);

        } catch (err) {
           console.error(err.message); 
            }
    };

    useEffect(() => {
        getInfo();
    }, []);

    return (
        <Fragment>
            <h1 className="text-center mt-5">
                    Read an Airman Record
            </h1>
            <table className="table">
                <thead className="thead-dark">
                    <tr>
                        <th scope="col">Grade</th>
                        <th scope="col">First Name</th>
                        <th scope="col">Last Name</th>
                        <th scope="col">E-mail</th>
                        <th scope="col">Base</th>
                        <th scope="col">Unit</th>
                        <th scope="col">AFSC</th>
                        <th scope="col">Duty Position</th>
                    </tr>
                </thead>

                <tbody>
                {airman.map (airman => (
                    <tr>
                        <td>{airman.grade}</td>
                        <td>{airman.firstName}</td>
                        <td>{airman.lastName}</td>
                        <td>{airman.email}</td>
                        <td>{airman.base}</td>
                        <td>{airman.unit}</td>
                        <td>{airman.afsc}</td>
                        <td>{airman.role}</td>
                    </tr>
                    ))}
                </tbody>
            </table>
            
        </Fragment>
    )
};

export default Read