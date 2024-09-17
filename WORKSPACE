#
# Bazel WORKSPACE (legacy)
#

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")
load("@bazel_tools//tools/build_defs/repo:utils.bzl", "maybe")

http_archive(
    name = "bazel_skylib",
    sha256 = "9f38886a40548c6e96c106b752f242130ee11aaa068a56ba7e56f4511f33e4f2",
    urls = ["https://github.com/bazelbuild/bazel-skylib/releases/download/1.6.1/bazel-skylib-1.6.1.tar.gz"],
)

http_archive(
    name = "rules_cc",
    sha256 = "2037875b9a4456dce4a79d112a8ae885bbc4aad968e6587dca6e64f3a0900cdf",
    strip_prefix = "rules_cc-0.0.9",
    urls = ["https://github.com/bazelbuild/rules_cc/releases/download/0.0.9/rules_cc-0.0.9.tar.gz"],
)

http_archive(
    name = "rules_license",
    sha256 = "4531deccb913639c30e5c7512a054d5d875698daeb75d8cf90f284375fe7c360",
    urls = ["https://github.com/bazelbuild/rules_license/releases/download/0.0.7/rules_license-0.0.7.tar.gz"],
)

http_archive(
    name = "rules_java",
    sha256 = "4018e97c93f97680f1650ffd2a7530245b864ac543fd24fae8c02ba447cb2864",
    urls = ["https://github.com/bazelbuild/rules_java/releases/download/7.3.1/rules_java-7.3.1.tar.gz"],
)

load("@bazel_tools//tools/jdk:remote_java_repository.bzl", "remote_java_repository")

maybe(
    remote_java_repository,
    name = "jdk11",
    sha256 = "99be79935354f5c0df1ad293620ea36d13f48ec3ea870c838f20c504c9668b57",
    strip_prefix = "jdk-11.0.2",
    urls = ["https://download.java.net/java/GA/jdk11/9/GPL/openjdk-11.0.2_linux-x64_bin.tar.gz"],
    version = "11",
)

register_toolchains("@jdk11//:all")

http_archive(
    name = "rules_jvm_external",
    sha256 = "d31e369b854322ca5098ea12c69d7175ded971435e55c18dd9dd5f29cc5249ac",
    strip_prefix = "rules_jvm_external-5.3",
    urls = ["https://github.com/bazelbuild/rules_jvm_external/releases/download/5.3/rules_jvm_external-5.3.tar.gz"],
)

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    name = "maven",
    artifacts = [
        "org.slf4j:slf4j-api:2.0.7",
        "org.slf4j:slf4j-simple:2.0.7",
        "junit:junit:4.13",
    ],
    fetch_sources = True,
    maven_install_json = "//:maven_install.json",
    repositories = ["https://repo1.maven.org/maven2"],
)

load("@maven//:defs.bzl", "pinned_maven_install")

pinned_maven_install()