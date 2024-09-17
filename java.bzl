load("@rules_java//toolchains:remote_java_repository.bzl", "remote_java_repository")

def _impl(modctx):
    remote_java_repository(
        name = "jdk11",
        version = "11",
        urls = ["https://download.java.net/java/GA/jdk11/9/GPL/openjdk-11.0.2_linux-x64_bin.tar.gz"],
        sha256 = "99be79935354f5c0df1ad293620ea36d13f48ec3ea870c838f20c504c9668b57",
        strip_prefix = "jdk-11.0.2",
    )

custom_java = module_extension(implementation = _impl)