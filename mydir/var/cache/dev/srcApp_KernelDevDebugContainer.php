<?php

// This file has been auto-generated by the Symfony Dependency Injection Component for internal use.

if (\class_exists(\ContainerEsYoCvY\srcApp_KernelDevDebugContainer::class, false)) {
    // no-op
} elseif (!include __DIR__.'/ContainerEsYoCvY/srcApp_KernelDevDebugContainer.php') {
    touch(__DIR__.'/ContainerEsYoCvY.legacy');

    return;
}

if (!\class_exists(srcApp_KernelDevDebugContainer::class, false)) {
    \class_alias(\ContainerEsYoCvY\srcApp_KernelDevDebugContainer::class, srcApp_KernelDevDebugContainer::class, false);
}

return new \ContainerEsYoCvY\srcApp_KernelDevDebugContainer([
    'container.build_hash' => 'EsYoCvY',
    'container.build_id' => 'c15d7170',
    'container.build_time' => 1615467914,
], __DIR__.\DIRECTORY_SEPARATOR.'ContainerEsYoCvY');
