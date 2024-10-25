package com.forsale.app.datalayer.network.responses;

import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: AddonsResponse.kt */
/* loaded from: classes2.dex */
public final class AddonsResponse {
    public static final int $stable = 8;
    @c("addons_groups")
    private final List<AddonsGroup> addonsGroups;
    @c("featured_addons_groups")
    private final List<AddonsGroup> featuredAddonsGroups;

    public AddonsResponse() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddonsResponse copy$default(AddonsResponse addonsResponse, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = addonsResponse.addonsGroups;
        }
        if ((i11 & 2) != 0) {
            list2 = addonsResponse.featuredAddonsGroups;
        }
        return addonsResponse.copy(list, list2);
    }

    public final List<AddonsGroup> component1() {
        return this.addonsGroups;
    }

    public final List<AddonsGroup> component2() {
        return this.featuredAddonsGroups;
    }

    public final AddonsResponse copy(List<AddonsGroup> addonsGroups, List<AddonsGroup> featuredAddonsGroups) {
        o.i(addonsGroups, "addonsGroups");
        o.i(featuredAddonsGroups, "featuredAddonsGroups");
        return new AddonsResponse(addonsGroups, featuredAddonsGroups);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddonsResponse)) {
            return false;
        }
        AddonsResponse addonsResponse = (AddonsResponse) obj;
        if (o.d(this.addonsGroups, addonsResponse.addonsGroups) && o.d(this.featuredAddonsGroups, addonsResponse.featuredAddonsGroups)) {
            return true;
        }
        return false;
    }

    public final List<AddonsGroup> getAddonsGroups() {
        return this.addonsGroups;
    }

    public final List<AddonsGroup> getFeaturedAddonsGroups() {
        return this.featuredAddonsGroups;
    }

    public int hashCode() {
        return (this.addonsGroups.hashCode() * 31) + this.featuredAddonsGroups.hashCode();
    }

    public String toString() {
        List<AddonsGroup> list = this.addonsGroups;
        List<AddonsGroup> list2 = this.featuredAddonsGroups;
        return "AddonsResponse(addonsGroups=" + list + ", featuredAddonsGroups=" + list2 + ")";
    }

    public AddonsResponse(List<AddonsGroup> addonsGroups, List<AddonsGroup> featuredAddonsGroups) {
        o.i(addonsGroups, "addonsGroups");
        o.i(featuredAddonsGroups, "featuredAddonsGroups");
        this.addonsGroups = addonsGroups;
        this.featuredAddonsGroups = featuredAddonsGroups;
    }

    public /* synthetic */ AddonsResponse(List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? r.n() : list, (i11 & 2) != 0 ? r.n() : list2);
    }
}
