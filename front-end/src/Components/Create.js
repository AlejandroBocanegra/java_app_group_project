import React, { Fragment, useState } from 'react'

//Form Submit Handeling
const Create = () => {

    const [airman, setAirman] = useState("");
    // const [record, setRecord] = useState("");

    const handleChange = (event) => {
        setAirman({...airman, [event.target.id]:event.target.value})
    }

    const handleChangeCheckBoxStyle = (event) => {
        setAirman({...airman, [event.target.id]:!airman[event.target.id]})
    }

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

            const response1 = await fetch("http://localhost:8080/newUser", {
                method: "POST",
                headers: { "Content-Type": "application/json" },
                body: JSON.stringify(body)
            });

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
                        onChange={handleChange}
                    />
                    <label for="firstName">Enter First Name</label>
                    <input
                        id="firstName"
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="John"
                        value={airman.firstName}
                        onChange={handleChange}
                    />
                    <label for="lastName">Enter Last Name</label>
                    <input
                        id="lastName"
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="Spartan"
                        value={airman.lastName}
                        onChange={handleChange}
                    />
                    <label for="baseName">Enter Base Name</label>
                    <input
                        id="base"
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="Thor AB"
                        value={airman.base}
                        onChange={handleChange}
                    />
                    <label for="unitName">Enter Unit Name</label>
                    <input
                        id="unit"
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="101 CS"
                        value={airman.unit}
                        onChange={handleChange}
                    />
                    <label for="afsc">Enter AFSC</label>
                    <input
                        id="afsc"
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="5P453"
                        value={airman.afsc}
                        onChange={handleChange}
                    />
                    <label for="duty">Enter Duty Position</label>
                    <input
                        id="dutyPosition"
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="Space Marine"
                        value={airman.dutyPosition}
                        onChange={handleChange}
                    />
                    <label for="email">Enter E-Mail</label>
                    <input
                        id="email"
                        type="email"
                        className="form-control form-control-sm"
                        placeholder="J.Spartan@mewmew.mil"
                        value={airman.email}
                        onChange={handleChange}
                    />
                    <label for="password">Enter a Password</label>
                    <input
                        id="password"
                        type="password"
                        className="form-control form-control-sm"
                        placeholder="Gr33nt4st35th3B3st"
                        value={airman.password}
                        onChange={handleChange}
                    />
                    <small id="passwordHelpBlock" className="form-text text-muted">
                        Your password must be 8-20 characters long, contain letters and numbers, and must not contain spaces, special characters, or emoji.
                    </small>
                </div>
                <div className="col-auto">
                    <div class="form-check mb-2 d-flex mt-1">
                        <input
                            id="isAnthraxShotCompleted"
                            type="checkbox"
                            className="form-check-input"
                           // value={airman.mrt.isAnthraxShotCompleted}
                            onChange={handleChangeCheckBoxStyle}
                        />
                        <label class="form-check-label">Anthrax Up-to-Date</label>
                    </div>
                    <div class="form-check mb-2 d-flex mt-5">
                        <input
                            id="isDentalCheckCompleted"
                            type="checkbox"
                            className="form-check-input"
                            //value={airman.mrt.isDentalCheckCompleted}
                            onChange={handleChangeCheckBoxStyle}
                        />
                        <label class="form-check-label">Dental Records Up-to-Date</label>
                    </div>
                    <div class="form-check mb-2 d-flex mt-5">
                        <input
                            id="isMentalCheckCompleted"
                            type="checkbox"
                            className="form-check-input"
                            //value={airman.mrt.isMentalCheckCompleted}
                            onChange={handleChangeCheckBoxStyle}
                        />
                        <label class="form-check-label">Mental Health Up-to-Date</label>
                    </div>
                    <div class="form-check mb-2 d-flex mt-5">
                        <input
                            id="isOpticalCheckCompleted"
                            type="checkbox"
                            className="form-check-input"
                            //value={airman.mrt.isOpticalCheckCompleted}
                            onChange={handleChangeCheckBoxStyle}
                        />
                        <label class="form-check-label">Optical Records Up-to-Date</label>
                    </div>
                    <div class="form-check mb-2 d-flex mt-5">
                        <input
                            id="isPhysicalCheckCompleted"
                            type="checkbox"
                            className="form-check-input"
                            //value={airman.mrt.isPhysicalCheckCompleted}
                            onChange={handleChangeCheckBoxStyle}
                        />
                        <label class="form-check-label">Physiological Records Up-to-Date</label>
                    </div>
                    <div class="form-check mb-2 d-flex mt-5">
                        <input
                            id="isMalariaShotCompleted"
                            type="checkbox"
                            className="form-check-input"
                            //value={airman.mrt.isMalariaShotCompleted}
                            onChange={handleChangeCheckBoxStyle}
                        />
                        <label class="form-check-label">Malaria Inoculation Up-to-Date</label>
                    </div>
                    <div class="form-check mb-2 d-flex mt-5">
                        <input
                            id="isPenicillinShotkCompleted"
                            type="checkbox"
                            className="form-check-input"
                            //value={airman.mrt.isPenicillinShotkCompleted}
                            onChange={handleChangeCheckBoxStyle}
                        />
                        <label class="form-check-label">Penicillin Inoculation Up-to-Date</label>
                    </div>
                    <div class="form-check mb-2 d-flex mt-5">
                        <input
                            id="isSmallPoxCompleted"
                            type="checkbox"
                            className="form-check-input"
                            //value={airman.mrt.isSmallPoxCompleted}
                            onChange={handleChangeCheckBoxStyle}
                        />
                        <label class="form-check-label">Small Pox Inoculation Up-to-Date</label>
                    </div>
                    <div class="form-check mb-2 d-flex mt-5">
                        <input
                            id="isHivCheckCompleted"
                            type="checkbox"
                            className="form-check-input"
                            //value={airman.mrt.isHivCheckCompleted}
                            onChange={handleChangeCheckBoxStyle}
                        />
                        <label class="form-check-label">HIV Records Up-to-Date</label>
                    </div>
                    <div class="form-check mb-2 d-flex mt-5">
                        <input
                            id="isTasked"
                            type="checkbox"
                            className="form-check-input"
                            //value={airman.mrt.isTasked}
                            onChange={handleChangeCheckBoxStyle}
                        />
                        <label class="form-check-label">Personnel Tasked</label>
                    </div>
                    <div class="form-check mb-2 d-flex mt-5">
                        <input
                            id="isDeploymentMentalCheckCompleted"
                            type="checkbox"
                            className="form-check-input"
                            //value={airman.mrt.isDeploymentMentalCheckCompleted}
                            onChange={handleChangeCheckBoxStyle}
                        />
                        <label class="form-check-label">Pre-Deployment Mental Checkup Up-to-Date</label>
                    </div>
                    <div class="form-check mb-2 d-flex mt-5">
                        <input
                            id="isReturnMentalCheckCompleted"
                            type="checkbox"
                            className="form-check-input"
                            //value={airman.mrt.isReturnMentalCheckCompleted}
                            onChange={handleChangeCheckBoxStyle}
                        />
                        <label class="form-check-label">Post-Deployment Mental Checkup Up-to-Date</label>
                    </div>
                </div>
                <div className="col-auto">
                    <label className="d-flex mt-0">Date of Last Anthrax Inoculation</label>
                    <input
                        id="anthraxShotLast"
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="dd MMM YY"
                        //value={airman.mrt.anthraxShotLast}
                        onChange={handleChange}
                    />
                    <label className="d-flex mt-2">Date of Last Dental Exam </label>
                    <input
                        id="mentalCheckLast"
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="dd MMM YY"
                        //value={airman.mrt.mentalCheckLast}
                        onChange={handleChange}
                    />
                    <label className="d-flex mt-2">Date of Last Mental Health Checkup (PHA)</label>
                    <input
                        id="opticalCheckLast"
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="dd MMM YY"
                        //value={airman.mrt.opticalCheckLast}
                        onChange={handleChange}
                    />
                    <label className="d-flex mt-2">Date of Last Optical Exam</label>
                    <input
                        id="physicalCheckLast"
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="dd MMM YY"
                        //value={airman.mrt.physicalCheckLast}
                        onChange={handleChange}
                    />
                    <label className="d-flex mt-2">Date of Last Physiological Exam</label>
                    <input
                        id="malariaShotLast"
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="dd MMM YY"
                        //value={airman.mrt.malariaShotLast}
                        onChange={handleChange}
                    />
                    <label className="d-flex mt-2">Date of Last Malaria Inoculation</label>
                    <input
                        id="penicillinShotLast"
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="dd MMM YY"
                        //value={airman.mrt.penicillinShotLast}
                        onChange={handleChange}
                    />
                    <label className="d-flex mt-2">Date of Last Penicillin Inoculation</label>
                    <input
                        id="smallpoxShotLast"
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="dd MMM YY"
                        //value={airman.mrt.smallpoxShotLast}
                        onChange={handleChange}
                    />
                    <label className="d-flex mt-2">Date of Last Smallpox Inoculation</label>
                    <input
                        id="hivCheckLast"
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="dd MMM YY"
                        //value={airman.mrt.hivCheckLast}
                        onChange={handleChange}
                    />
                    <label className="d-flex mt-2">Date of Last HIV Checkup</label>
                    <input
                        id="taskDepartureDate"
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="dd MMM YY"
                        //value={airman.mrt.taskDepartureDate}
                        onChange={handleChange}
                    />
                    <label className="d-flex mt-2">Task RTNL Date</label>
                    <input
                        id="taskDepartByDate"
                        type="text"
                        className="form-control form-control-sm"
                        placeholder="dd MMM YY"
                        //value={airman.mrt.taskDepartByDate}
                        onChange={handleChange}
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