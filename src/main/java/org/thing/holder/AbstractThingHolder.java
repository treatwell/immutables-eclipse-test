package org.thing.holder;

import java.util.Set;

import org.immutables.value.Value;
import org.thing.ImmutableThing;

@Value.Immutable
abstract class AbstractThingHolder {

    public abstract Set<ImmutableThing> getThings();
    
    public static ImmutableThingHolder ofThings(Set<ImmutableThing> things) {
        return ImmutableThingHolder.builder().addAllThings(things).build();
    }

}
