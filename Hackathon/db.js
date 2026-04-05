document.getElementById('marksForm').addEventListener('submit', function (e) {
    e.preventDefault();

    const studentId = document.getElementById('studentId').value.trim();
    const studentName = document.getElementById('studentName').value.trim();
    const examType = document.getElementById('examType').value;

    const subjects = {
        Tamil: Number(document.getElementById('sub1').value),
        English: Number(document.getElementById('sub2').value),
        Maths: Number(document.getElementById('sub3').value),
        Science: Number(document.getElementById('sub4').value),
        'Social Science': Number(document.getElementById('sub5').value)
    };

    for (const [name, mark] of Object.entries(subjects)) {
        if (mark < 0 || mark > 100) {
            showToast(name + ' mark must be between 0 and 100', 'error');
            return;
        }
    }

    const total = Object.values(subjects).reduce((a, b) => a + b, 0);
    const average = (total / 5).toFixed(2);

    const record = {
        studentId,
        studentName,
        examType,
        subjects,
        total,
        average: parseFloat(average),
        date: new Date().toISOString()
    };
}
);