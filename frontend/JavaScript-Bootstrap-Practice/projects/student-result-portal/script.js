alert("Welcome to the Student Result Portal!");

const btn = document.getElementById("announceBtn");
btn.addEventListener("click",function(){
    const userChoice = confirm("Do you want to view your examination result?");

    if (userChoice) {
       document.title ="Student Result";
       document.body.innerHTML = `
        <main class="container-fluid  d-flex justify-content-center align-items-center min-vh-100">
            <div class="row justify-content-center w-100">
                <div class="col-12 col-sm-10 col-md-7 col-lg-5">

                    <section class="card border rounded-4 py-5 px-4  px-md-5 shadow-sm text-center">
                        <div class="px-md-4 py-2">

                            <div>
                                <h1 class="fw-bold text-navy mb-4">STUDENT RESULT REPORT</h1>
                                <p class="fs-6">Academic Year: 2026-2027</p>
                            </div>
                            <hr class="my-4">
                            <div>
                                <p>Student Name: Ibrahim Rahman</p>
                                <p>Course: Java Full Stack</p>
                                <p>Examination: Final Assessment</p>
                                <p>Institute: Stanford University</p>
                                <h2 class="text-success fw-bold fs-3 my-4">RESULT: PASS</h2>
                                <p>Congratulations! Result announcement completed.</p>
                            </div>

                        </div>
                    </section>

                </div>

            </div>
            

        </main>`;
    } else {
        // Yahan Cancel wala code (alert + document.title aur CANCELLED wala document.body.innerHTML)
        alert("You cancelled the result request!");
        document.title = "Student Result";
        document.body.innerHTML = `
        <main class="container-fluid  d-flex justify-content-center align-items-center min-vh-100">
            <div class="row justify-content-center w-100">
                <div class="col-12 col-sm-10 col-md-7 col-lg-5">

                    <section class="card border rounded-4 py-5 px-4  px-md-5 shadow-sm text-center">
                        <div class="px-md-4 py-2">

                            <div>
                                <h1 class="fw-bold text-navy mb-4">STUDENT RESULT REPORT</h1>
                                <p class="fs-6">Academic Year: 2026-2027</p>
                            </div>
                            <hr class="my-4">
                            <div>
                                <p>Student Name: Ibrahim Rahman</p>
                                <p>Course: Java Full Stack</p>
                                <p>Examination: Final Assessment</p>
                                <p>Institute: Stanford University</p>
                                <h2 class="text-danger-emphasis fw-bold fs-4 mt-4 mb-0">You cancelled the result request!!!</h2>
                            </div>

                        </div>
                    </section>

                </div>

            </div>
            

        </main>`;
    }
});

