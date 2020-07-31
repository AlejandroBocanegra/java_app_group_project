import React, { Fragment, useEffect, useState } from 'react'

//Form Submit Handeling
const Read = () => {

    const [airman, setAirman] = useState([]);


    //delete function
    const deleteAirmanRecord = async (id) => {
        try {
            const deleteAirmanRecord = await fetch(`http://localhost:8080/deleteUser/${id}`, {
                method: "DELETE"
            });

            setAirman(airman.filter(ctrlAltDel => ctrlAltDel.ctrlAltDel_id !== id));
        } catch (err) {
            console.error(err.message);
        }
    };

    const getInfo = async () => {

        try {
            //Amn Table
            const response = await fetch("http://localhost:8080/viewAllUsers");
            const amnJsonData = await response.json();

            setAirman(amnJsonData);

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
                        <th scope="col">test</th>
                        <th scope="col">Grade</th>
                        <th scope="col">First Name</th>
                        <th scope="col">Last Name</th>
                        <th scope="col">E-mail</th>
                        <th scope="col">Base</th>
                        <th scope="col">Unit</th>
                        <th scope="col">AFSC</th>
                        <th scope="col">Duty Position</th>
                        <th scope="col">Tasked?</th>
                        <th scope="col">Task RNLTD</th>
                        <th scope="col">PHA Complete?</th>
                        <th scope="col">Last PHA</th>
                        <th scope="col">Next PHA Due By</th>
                        <th scope="col">Annual Dental Exam?</th>
                        <th scope="col">Last Dental Exam</th>
                        <th scope="col">Next Dental Exam Due By</th>
                        <th scope="col">Annual Optomety Exam?</th>
                        <th scope="col">Last Optomety Exam</th>
                        <th scope="col">Next Optomety Exam Due By</th>
                        <th scope="col">Annual Physical Exam?</th>
                        <th scope="col">Last Annual Physical Exam</th>
                        <th scope="col">Next Annual Physical Exam Due By</th>
                        <th scope="col">Malaria Vacination?</th>
                        <th scope="col">Last Malaria Inoculation</th>
                        <th scope="col">Next Malaria Inoculation</th>
                        <th scope="col">Penicillin Shot Completed?</th>
                        <th scope="col">Last Penicillin Shot</th>
                        <th scope="col">Next Penicillin Shot Due By</th>
                        <th scope="col">Anthrax Vacination?</th>
                        <th scope="col">Last Anthrax Inoculation</th>
                        <th scope="col">Next Anthrax Inoculation Due By</th>
                        <th scope="col">Small Pox Vacination?</th>
                        <th scope="col">Last Small Pox Inoculation</th>
                        <th scope="col">Next Small Pox Inoculation Due By</th>
                        <th scope="col">HIV Test?</th>
                        <th scope="col">Last HIV Test</th>
                        <th scope="col">Next HIV Test Due By</th>
                        <th scope="col">Pre-Deployment Mental Assessmet?</th>
                        <th scope="col">Pre-Deployment Mental Assessmet Due By</th>
                        <th scope="col">Post-Deployment Mental Assessmet?</th>
                        <th scope="col">Post-Deployment Mental Assessmet Due By</th>
                    </tr>
                </thead>

                <tbody>
                    {airman.map(airman => (
                        <tr key= {airman.utMrtJoin}>
                            <td>{`${airman.utMrtJoin}`}</td>
                            <td>{airman.grade}</td>
                            <td>{airman.firstName}</td>
                            <td>{airman.lastName}</td>
                            <td>{airman.email}</td>
                            <td>{airman.base}</td>
                            <td>{airman.unit}</td>
                            <td>{airman.afsc}</td>
                            <td>{airman.role}</td>
                            <td>{airman.mrt.isTasked}</td>
                            <td>{airman.mrt.taskDepartByDate}</td>
                            <td>{`${airman.mrt.isMentalCheckCompleted}`}</td>
                            <td>{airman.mrt.mentalCheckLast}</td>
                            <td>{airman.mrt.mentalCheckNext}</td>
                            <td>{`${airman.mrt.isDentalCheckCompleted}`}</td>
                            <td>{airman.mrt.dentalCheckLast}</td>
                            <td>{airman.mrt.dentalCheckNext}</td>
                            <td>{`${airman.mrt.isOpticalCheckCompleted}`}</td>
                            <td>{airman.mrt.opticalCheckLast}</td>
                            <td>{airman.mrt.opticalCheckNext}</td>
                            <td>{`${airman.mrt.isPhysicalCheckCompleted}`}</td>
                            <td>{airman.mrt.physicalCheckLast}</td>
                            <td>{airman.mrt.physicalCheckNext}</td>
                            <td>{`${airman.mrt.isMalariaShotCompleted}`}</td>
                            <td>{airman.mrt.malariaShotLast}</td>
                            <td>{airman.mrt.malariaShotNext}</td>
                            <td>{`${airman.mrt.isPenicillinShotCompleted}`}</td>
                            <td>{airman.mrt.penicillianShotLast}</td>
                            <td>{airman.mrt.penicillianShotNext}</td>
                            <td>{`${airman.mrt.isAnthraxShotCompleted}`}</td>
                            <td>{airman.mrt.anthraxShotLast}</td>
                            <td>{airman.mrt.anthraxShotNext}</td>
                            <td>{`${airman.mrt.isSmallpoxShotCompleted}`}</td>
                            <td>{airman.mrt.smallpoxShotLast}</td>
                            <td>{airman.mrt.smallpoxShotNext}</td>
                            <td>{`${airman.mrt.isHivCheckCompleted}`}</td>
                            <td>{airman.mrt.hivCheckLast}</td>
                            <td>{airman.mrt.hivCheckNext}</td>
                            <td>{`${airman.mrt.isDeplpoyMentalCheckCompleted}`}</td>
                            <td>{airman.mrt.deployMentalCheckDue}</td>
                            <td>{`${airman.mrt.isReturnMentalCheckCompelted}`}</td>
                            <td>{airman.mrt.returnMentalCheckDue}</td>
                            <td>
                                <button
                                    className="btn btn-danger"
                                    onClick={() => deleteAirmanRecord(airman.userId)}
                                >
                                    Delete
                        </button>
                            </td>
                        </tr>
                    ))}
                </tbody>
            </table>

        </Fragment>
    )
};

export default Read