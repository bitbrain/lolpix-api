package org.lolpix.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Checks if we're running in production mode.
 * @author Lukas F&uuml;lling
 */
public class ProductionCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return !Boolean.parseBoolean(System.getenv("DEVMODE"));
    }
}
