def call(Map config = [:]) {
    loadLinuxScript(name: 'helloWorld.sh')
    sh "./helloWorld.sh ${config.name} ${config.dayOfWeek}"
}