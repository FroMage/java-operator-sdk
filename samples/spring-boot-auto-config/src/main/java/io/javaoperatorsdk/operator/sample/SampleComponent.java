package io.javaoperatorsdk.operator.sample;

import io.javaoperatorsdk.operator.Operator;
import io.fabric8.kubernetes.client.KubernetesClient;
import org.springframework.stereotype.Component;

/**
 * This component just showcases what beans are registered.
 */
@Component
public class SampleComponent {

    private final Operator operator;

    private final KubernetesClient kubernetesClient;

    private final CustomServiceController customServiceController;

    public SampleComponent(Operator operator, KubernetesClient kubernetesClient,
                           CustomServiceController customServiceController) {
        this.operator = operator;
        this.kubernetesClient = kubernetesClient;
        this.customServiceController = customServiceController;
    }
}