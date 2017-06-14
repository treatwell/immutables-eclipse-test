package org.thing;

import static org.immutables.value.Value.Style.ImplementationVisibility.PUBLIC;

import org.immutables.value.Value;
import org.immutables.value.Value.Style;

@Value.Immutable
@Style(
        visibility = PUBLIC
)
abstract class AbstractThing 
{
}

