package com.forsale.app.datalayer.database;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: AttributeValue.kt */
/* loaded from: classes2.dex */
public final class AttributeValue {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String ID = "id";
    public static final String VALUE = "val";
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f22300id;
    @c(VALUE)
    private final String value;

    /* compiled from: AttributeValue.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AttributeValue(String id2, String value) {
        o.i(id2, "id");
        o.i(value, "value");
        this.f22300id = id2;
        this.value = value;
    }

    public static /* synthetic */ AttributeValue copy$default(AttributeValue attributeValue, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = attributeValue.f22300id;
        }
        if ((i11 & 2) != 0) {
            str2 = attributeValue.value;
        }
        return attributeValue.copy(str, str2);
    }

    public final String component1() {
        return this.f22300id;
    }

    public final String component2() {
        return this.value;
    }

    public final AttributeValue copy(String id2, String value) {
        o.i(id2, "id");
        o.i(value, "value");
        return new AttributeValue(id2, value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttributeValue)) {
            return false;
        }
        AttributeValue attributeValue = (AttributeValue) obj;
        if (o.d(this.f22300id, attributeValue.f22300id) && o.d(this.value, attributeValue.value)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.f22300id;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.f22300id.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        String str = this.f22300id;
        String str2 = this.value;
        return "AttributeValue(id=" + str + ", value=" + str2 + ")";
    }
}
