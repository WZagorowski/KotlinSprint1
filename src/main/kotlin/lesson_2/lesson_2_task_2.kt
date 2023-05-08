package lesson_2
fun main(){
    val workers = 50
    val salaryOfWorker = 30000
    val interns = 30
    val salaryOfIntern = 20000

    val workersSalariesExpense = workers * salaryOfWorker
    println(workersSalariesExpense)

    val allSalariesExpense = workersSalariesExpense + interns * salaryOfIntern
    println(allSalariesExpense)

    val averageSalary = allSalariesExpense / (workers + interns)
    println(averageSalary)
}