MICRONAUT_DIR=../micronaut/src/main/kotlin/br/com/zup/beagle/sample/micronaut
SPRING_DIR=src/main/kotlin/br/com/zup/beagle/sample/spring

function convert_package() {
    for source in "$SPRING_DIR/$1"/*.kt; do
        sed -f spring2micronaut.sed "$source" > "$MICRONAUT_DIR/$1/$(basename "$source")"
    done
}

convert_package service
convert_package controller
