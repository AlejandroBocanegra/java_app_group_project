import React, { Fragment, useState } from 'react'

//Form Submit Handeling
const Create = () => {

    const [airman, setAirman] = useState("");
    const [record, setRecord] = useState("");

    const onSubmitForm = async event => {
        event.preventDefault();
        try {
            const body = {
                firstName: document.getElementById('firstName').value,
                grade: document.getElementById('grade').value,
                edipi: document.getElementById('edipi').value,
                afsc: document.getElementById('afsc').value,
                role: document.getElementById('role').value,
                base: document.getElementById('base').value,
                unit: document.getElementById('unit').value,
                password: document.getElementById('password').value,
                lastName: document.getElementById('lastName').value,
                email: document.getElementById('email').value,
                isTasked: document.getElementById('isTasked').value,
                taskDepartByDate: document.getElementById('taskDepartByDate').value,
                isMentalCheckCompleted: document.getElementById('isMentalCheckCompleted').value,
                mentalCheckLast: document.getElementById('mentalCheckLast').value,
                mentalCheckNext: document.getElementById('mentalCheckNext').value,
                isDentalCheckCompleted: document.getElementById('isDentalCheckCompleted').value,
                dentalCheckLast: document.getElementById('dentalCheckLast').value,
                dentalCheckNext: document.getElementById('dentalCheckNext').value,
                isOpticalCheckCompleted: document.getElementById('isOpticalCheckCompleted').value,
                opticalCheckLast: document.getElementById('opticalCheckLast').value,
                opticalCheckNext: document.getElementById('opticalCheckNext').value,
                isPhysicalCheckCompleted: document.getElementById('isPhysicalCheckCompleted').value,
                physicalCheckLast: document.getElementById('physicalCheckLast').value,
                physicalCheckNext: document.getElementById('physicalCheckNext').value,
                isMalariaShotCompleted: document.getElementById('isMalariaShotCompleted').value,
                malariaShotLast: document.getElementById('malariaShotLast').value,
                malariaShotNext: document.getElementById('malariaShotNext').value,
                isPenicillinShotCompleted: document.getElementById('isPenicillinShotCompleted').value,
                penicillianShotLast: document.getElementById('penicillianShotLast').value,
                penicillianShotNext: document.getElementById('penicillianShotNext').value,
                isAnthraxShotCompleted: document.getElementById('isAnthraxShotCompleted').value,
                anthraxShotLast: document.getElementById('emanthraxShotLastil').value,
                anthraxShotNext: document.getElementById('anthraxShotNext').value,
                isSmallpoxShotCompleted: document.getElementById('isSmallpoxShotCompleted').value,
                smallpoxShotLast: document.getElementById('smallpoxShotLast').value,
                smallpoxShotNext: document.getElementById('smallpoxShotNext').value,
                hivCheckLast: document.getElementById('hivCheckLast').value,
                isHivCheckCompleted: document.getElementById('isHivCheckCompleted').value,
                hivCheckNext: document.getElementById('hivCheckNext').value,
                isDeplpoyMentalCheckCompleted: document.getElementById('isDeplpoyMentalCheckCompleted').value,
                deployMentalCheckDue: document.getElementById('deployMentalCheckDue').value,
                isReturnMentalCheckCompelted: document.getElementById('isReturnMentalCheckCompelted').value,
                returnMentalCheckDue: document.getElementById('ereturnMentalCheckDueail').value

            };

            const response1 = await fetch("http://localhost:8080/viewAllUsers", {
                method: "POST",
                headers: { "Content-Type": "application/json" },
                body: JSON.stringify(body)
            });
            console.log(response1);

            const response2 = await fetch("http://localhost:8080/newUser", {
                method: "POST",
                headers: { "Content-Type": "application/json" },
                body: JSON.stringify(body)
            });
            console.log(response2);

            window.location = "/";

        } catch (err) {
            console.error(err.message);
        }

    };

    return (
        <Fragment>
            <h1
                className="text-center mt-5 text-monospace">
                Create an Airman and Record
            </h1>
            <form
                className="d-flex mt-5"
                onSubmit={onSubmitForm}>
                <div
                    className="form-row align-items-center">
                    <label for="grade">Enter Grade</label>
                    <input
                        id="grade"
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="E-1"
                        value={airman.grade}
                        onChange={event => setAirman(event.target.value)}
                    />
                    <label for="firstName">Enter First Name</label>
                    <input
                        id="firstName"
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="John"
                        value={airman.firstName}
                        onChange={event => setAirman(event.target.value)}
                    />
                    <label for="lastName">Enter Last Name</label>
                    <input
                        id="lastName"
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="Spartan"
                        value={airman.lastName}
                        onChange={event => setAirman(event.target.value)}
                    />
                    <label for="baseName">Enter Base Name</label>
                    <input
                        id="baseName"
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="Thor AB"
                        value={airman.base}
                        onChange={event => setAirman(event.target.value)}
                    />
                    <label for="unitName">Enter Unit Name</label>
                    <input
                        id="unitName"
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="101 CS"
                        value={airman.unit}
                        onChange={event => setAirman(event.target.value)}
                    />
                    <label for="afsc">Enter AFSC</label>
                    <input
                        id="AFSC"
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="5P453"
                        value={airman.afsc}
                        onChange={event => setAirman(event.target.value)}
                    />
                    <label for="duty">Enter Duty Position</label>
                    <input
                        id="duty"
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="Space Marine"
                        value={airman.dutyPosition}
                        onChange={event => setAirman(event.target.value)}
                    />
                    <label for="email">Enter E-Mail</label>
                    <input
                        id="email"
                        type="email"
                        className="form-control form-control-sm"
                        placeholder="J.Spartan@mewmew.mil"
                        value={airman.email}
                        onChange={event => setAirman(event.target.value)}
                    />
                    <label for="password">Enter a Password</label>
                    <input
                        type="password"
                        className="form-control form-control-sm"
                        placeholder="Gr33nt4st35th3B3st"
                        value={airman.password}
                        onChange={event => setAirman(event.target.value)}
                    />
                    <small id="passwordHelpBlock" className="form-text text-muted">
                        Your password must be 8-20 characters long, contain letters and numbers, and must not contain spaces, special characters, or emoji.
                    </small>
                </div>
                <div className="col-auto">
                    <div class="form-check mb-2 d-flex mt-1">
                        <input
                            id="autoSizingCheck"
                            type="checkbox"
                            className="form-check-input"
                            value={record.isAnthraxShotCompleted}
                            onChange={event => setRecord(event.target.value)}
                        />
                        <label class="form-check-label">Anthrax Up-to-Date</label>
                    </div>
                    <div class="form-check mb-2 d-flex mt-5">
                        <input
                            type="checkbox"
                            className="form-check-input"
                            value={record.isDentalCheckCompleted}
                            onChange={event => setRecord(event.target.value)}
                        />
                        <label class="form-check-label">Dental Records Up-to-Date</label>
                    </div>
                    <div class="form-check mb-2 d-flex mt-5">
                        <input
                            type="checkbox"
                            className="form-check-input"
                            value={record.isMentalCheckCompleted}
                            onChange={event => setRecord(event.target.value)}
                        />
                        <label class="form-check-label">Mental Health Up-to-Date</label>
                    </div>
                    <div class="form-check mb-2 d-flex mt-5">
                        <input
                            type="checkbox"
                            className="form-check-input"
                            value={record.isOpticalCheckCompleted}
                            onChange={event => setRecord(event.target.value)}
                        />
                        <label class="form-check-label">Optical Records Up-to-Date</label>
                    </div>
                    <div class="form-check mb-2 d-flex mt-5">
                        <input
                            type="checkbox"
                            className="form-check-input"
                            value={record.isPhysicalCheckCompleted}
                            onChange={event => setRecord(event.target.value)}
                        />
                        <label class="form-check-label">Physiological Records Up-to-Date</label>
                    </div>
                    <div class="form-check mb-2 d-flex mt-5">
                        <input
                            type="checkbox"
                            className="form-check-input"
                            value={record.isMalariaShotCompleted}
                            onChange={event => setRecord(event.target.value)}
                        />
                        <label class="form-check-label">Malaria Inoculation Up-to-Date</label>
                    </div>
                    <div class="form-check mb-2 d-flex mt-5">
                        <input
                            type="checkbox"
                            className="form-check-input"
                            value={record.isPenicillinShotkCompleted}
                            onChange={event => setRecord(event.target.value)}
                        />
                        <label class="form-check-label">Penicillin Inoculation Up-to-Date</label>
                    </div>
                    <div class="form-check mb-2 d-flex mt-5">
                        <input
                            type="checkbox"
                            className="form-check-input"
                            value={record.isSmallPoxCompleted}
                            onChange={event => setRecord(!record.isSmallPoxCompleted)}
                        />
                        <label class="form-check-label">Small Pox Inoculation Up-to-Date</label>
                    </div>
                    <div class="form-check mb-2 d-flex mt-5">
                        <input
                            type="checkbox"
                            className="form-check-input"
                            value={record.isHivCheckCompleted}
                            onChange={event => setRecord(event.target.value)}
                        />
                        <label class="form-check-label">HIV Records Up-to-Date</label>
                    </div>
                    <div class="form-check mb-2 d-flex mt-5">
                        <input
                            type="checkbox"
                            className="form-check-input"
                            value={record.isTasked}
                            onChange={event => setRecord(event.target.value)}
                        />
                        <label class="form-check-label">Personnel Tasked</label>
                    </div>
                    <div class="form-check mb-2 d-flex mt-5">
                        <input
                            type="checkbox"
                            className="form-check-input"
                            value={record.isDeploymentMentalCheckCompleted}
                            onChange={event => setRecord(event.target.value)}
                        />
                        <label class="form-check-label">Pre-Deployment Mental Checkup Up-to-Date</label>
                    </div>
                    <div class="form-check mb-2 d-flex mt-5">
                        <input
                            type="checkbox"
                            className="form-check-input"
                            value={record.isReturnMentalCheckCompleted}
                            onChange={event => setRecord(event.target.value)}
                        />
                        <label class="form-check-label">Post-Deployment Mental Checkup Up-to-Date</label>
                    </div>
                </div>
                <div className="col-auto">
                    <label className="d-flex mt-0">Date of Last Anthrax Inoculation</label>
                    <input
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="dd MMM YY"
                        value={record.anthraxShotLast}
                        onChange={event => setRecord(event.target.value)}
                    />
                    <label className="d-flex mt-2">Date of Last Dental Exam </label>
                    <input
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="dd MMM YY"
                        value={record.mentalCheckLast}
                        onChange={event => setRecord(event.target.value)}
                    />
                    <label className="d-flex mt-2">Date of Last Mental Health Checkup (PHA)</label>
                    <input
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="dd MMM YY"
                        value={record.opticalCheckLast}
                        onChange={event => setRecord(event.target.value)}
                    />
                    <label className="d-flex mt-2">Date of Last Optical Exam</label>
                    <input
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="dd MMM YY"
                        value={record.physicalCheckLast}
                        onChange={event => setRecord(event.target.value)}
                    />
                    <label className="d-flex mt-2">Date of Last Physiological Exam</label>
                    <input
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="dd MMM YY"
                        value={record.malariaShotLast}
                        onChange={event => setRecord(event.target.value)}
                    />
                    <label className="d-flex mt-2">Date of Last Malaria Inoculation</label>
                    <input
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="dd MMM YY"
                        value={record.penicillinShotLast}
                        onChange={event => setRecord(event.target.value)}
                    />
                    <label className="d-flex mt-2">Date of Last Penicillin Inoculation</label>
                    <input
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="dd MMM YY"
                        value={record.smallpoxShotLast}
                        onChange={event => setRecord(event.target.value)}
                    />
                    <label className="d-flex mt-2">Date of Last Smallpox Inoculation</label>
                    <input
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="dd MMM YY"
                        value={record.hivCheckLast}
                        onChange={event => setRecord(event.target.value)}
                    />
                    <label className="d-flex mt-2">Date of Last HIV Checkup</label>
                    <input
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="dd MMM YY"
                        value={record.taskDepartureDate}
                        onChange={event => setRecord(event.target.value)}
                    />
                    <label className="d-flex mt-2">Task RTNL Date</label>
                    <input
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="dd MMM YY"
                        value={record.taskDepartByDate}
                        onChange={event => setRecord(event.target.value)}
                    />
                    </div>

                <div className="form-row align-items-center">
                    <button
                        className="btn btn-primary btn-sm"
                    >
                        Submit New Member
                    </button>
                </div>

            </form>
        </Fragment>
    )
};

export default Create