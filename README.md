# demo-rewrite
this is a poc recipe AppendToSequence
To run recipelist succes:
mvn -U org.openrewrite.maven:rewrite-maven-plugin:run -Drewrite.activeRecipes=com.demo.migration-yes-working

To run recipelist fail:
mvn -U org.openrewrite.maven:rewrite-maven-plugin:run -Drewrite.activeRecipes=com.demo.migration-not-working
