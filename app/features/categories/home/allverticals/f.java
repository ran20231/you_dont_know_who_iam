package com.forsale.app.features.categories.home.allverticals;

import com.forsale.app.features.categories.home.allverticals.g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: AllVerticalsSectionType.kt */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static final a f23805c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final AllVerticalsSectionType f23806a;

    /* renamed from: b  reason: collision with root package name */
    private final g f23807b;

    /* compiled from: AllVerticalsSectionType.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(AllVerticalsSectionType section) {
            o.i(section, "section");
            return new f(section, g.c.f23810a);
        }
    }

    public f(AllVerticalsSectionType sectionType, g state) {
        o.i(sectionType, "sectionType");
        o.i(state, "state");
        this.f23806a = sectionType;
        this.f23807b = state;
    }

    public static /* synthetic */ f b(f fVar, AllVerticalsSectionType allVerticalsSectionType, g gVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            allVerticalsSectionType = fVar.f23806a;
        }
        if ((i11 & 2) != 0) {
            gVar = fVar.f23807b;
        }
        return fVar.a(allVerticalsSectionType, gVar);
    }

    public final f a(AllVerticalsSectionType sectionType, g state) {
        o.i(sectionType, "sectionType");
        o.i(state, "state");
        return new f(sectionType, state);
    }

    public final AllVerticalsSectionType c() {
        return this.f23806a;
    }

    public final g d() {
        return this.f23807b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f23806a == fVar.f23806a && o.d(this.f23807b, fVar.f23807b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f23806a.hashCode() * 31) + this.f23807b.hashCode();
    }

    public String toString() {
        AllVerticalsSectionType allVerticalsSectionType = this.f23806a;
        g gVar = this.f23807b;
        return "AllVerticalsSection(sectionType=" + allVerticalsSectionType + ", state=" + gVar + ")";
    }
}
