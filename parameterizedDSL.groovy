job('ejemplo-job-DSL-gh'){
  description('Job DSL desde GitHub de ejemplo para el curso')
  scm {
    git('https://github.com/whenao31/jenkins.jobs.git', 'main') { node -> 
      node / gitConfigName('whenao31')
      node / gitConfigEmail('whenao86@gmail.com')
    } 
  }
  parameters {
    stringParam('name', defaultValue = 'Wil', description = 'String param for the job')
    choiceParam('curso', ['jenkins', 'kubernetes', 'aws'])
    choiceParam('language', ['spanish', 'english', 'chinese', 'italian', 'french'])
  }
  /*triggers {
    cron('H/7 * * * *')
  }*/
  steps {
    shell("bash jobscript.sh")
  }
}
