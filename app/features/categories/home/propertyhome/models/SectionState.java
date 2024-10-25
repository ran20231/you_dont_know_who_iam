package com.forsale.app.features.categories.home.propertyhome.models;

import androidx.compose.runtime.a;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import g00.q;
import j0.d1;
import j0.v0;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: SectionState.kt */
/* loaded from: classes2.dex */
public abstract class SectionState {

    /* compiled from: SectionState.kt */
    /* loaded from: classes2.dex */
    public static final class a extends SectionState {

        /* renamed from: a  reason: collision with root package name */
        public static final a f25083a = new a();

        private a() {
            super(null);
        }
    }

    /* compiled from: SectionState.kt */
    /* loaded from: classes2.dex */
    public static final class b extends SectionState {

        /* renamed from: a  reason: collision with root package name */
        private final Throwable f25084a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable throwable) {
            super(null);
            o.i(throwable, "throwable");
            this.f25084a = throwable;
        }

        public final Throwable b() {
            return this.f25084a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && o.d(this.f25084a, ((b) obj).f25084a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f25084a.hashCode();
        }

        public String toString() {
            Throwable th2 = this.f25084a;
            return "Error(throwable=" + th2 + ")";
        }
    }

    /* compiled from: SectionState.kt */
    /* loaded from: classes2.dex */
    public static final class c extends SectionState {

        /* renamed from: a  reason: collision with root package name */
        public static final c f25085a = new c();

        private c() {
            super(null);
        }
    }

    /* compiled from: SectionState.kt */
    /* loaded from: classes2.dex */
    public static final class d extends SectionState {

        /* renamed from: a  reason: collision with root package name */
        public static final d f25086a = new d();

        private d() {
            super(null);
        }
    }

    /* compiled from: SectionState.kt */
    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private final List<?> f25087a;

        /* renamed from: b  reason: collision with root package name */
        private final ListingsResponse.UISettings.Label f25088b;

        /* renamed from: c  reason: collision with root package name */
        private final ListingsResponse.UISettings.Label f25089c;

        /* renamed from: d  reason: collision with root package name */
        private final zc.d f25090d;

        public e() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ e b(e eVar, List list, ListingsResponse.UISettings.Label label, ListingsResponse.UISettings.Label label2, zc.d dVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = eVar.f25087a;
            }
            if ((i11 & 2) != 0) {
                label = eVar.f25088b;
            }
            if ((i11 & 4) != 0) {
                label2 = eVar.f25089c;
            }
            if ((i11 & 8) != 0) {
                dVar = eVar.f25090d;
            }
            return eVar.a(list, label, label2, dVar);
        }

        public final e a(List<?> list, ListingsResponse.UISettings.Label title, ListingsResponse.UISettings.Label subtitle, zc.d dVar) {
            o.i(list, "list");
            o.i(title, "title");
            o.i(subtitle, "subtitle");
            return new e(list, title, subtitle, dVar);
        }

        public final zc.d c() {
            return this.f25090d;
        }

        public final List<?> d() {
            return this.f25087a;
        }

        public final ListingsResponse.UISettings.Label e() {
            return this.f25089c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (o.d(this.f25087a, eVar.f25087a) && o.d(this.f25088b, eVar.f25088b) && o.d(this.f25089c, eVar.f25089c) && o.d(this.f25090d, eVar.f25090d)) {
                return true;
            }
            return false;
        }

        public final ListingsResponse.UISettings.Label f() {
            return this.f25088b;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((((this.f25087a.hashCode() * 31) + this.f25088b.hashCode()) * 31) + this.f25089c.hashCode()) * 31;
            zc.d dVar = this.f25090d;
            if (dVar == null) {
                hashCode = 0;
            } else {
                hashCode = dVar.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            List<?> list = this.f25087a;
            ListingsResponse.UISettings.Label label = this.f25088b;
            ListingsResponse.UISettings.Label label2 = this.f25089c;
            zc.d dVar = this.f25090d;
            return "SectionResult(list=" + list + ", title=" + label + ", subtitle=" + label2 + ", fillerSetting=" + dVar + ")";
        }

        public e(List<?> list, ListingsResponse.UISettings.Label title, ListingsResponse.UISettings.Label subtitle, zc.d dVar) {
            o.i(list, "list");
            o.i(title, "title");
            o.i(subtitle, "subtitle");
            this.f25087a = list;
            this.f25088b = title;
            this.f25089c = subtitle;
            this.f25090d = dVar;
        }

        public /* synthetic */ e(List list, ListingsResponse.UISettings.Label label, ListingsResponse.UISettings.Label label2, zc.d dVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? r.n() : list, (i11 & 2) != 0 ? new ListingsResponse.UISettings.Label(null, null, 3, null) : label, (i11 & 4) != 0 ? new ListingsResponse.UISettings.Label(null, null, 3, null) : label2, (i11 & 8) != 0 ? null : dVar);
        }
    }

    /* compiled from: SectionState.kt */
    /* loaded from: classes2.dex */
    public static final class f extends SectionState {

        /* renamed from: a  reason: collision with root package name */
        private final e f25091a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e result) {
            super(null);
            o.i(result, "result");
            this.f25091a = result;
        }

        public final e b() {
            return this.f25091a;
        }
    }

    private SectionState() {
    }

    public /* synthetic */ SectionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void a(final q<? super e, ? super androidx.compose.runtime.a, ? super Integer, p> loadContent, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        boolean z11;
        int i13;
        int i14;
        o.i(loadContent, "loadContent");
        androidx.compose.runtime.a h11 = aVar.h(1368329210);
        if ((i11 & 14) == 0) {
            if (h11.F(loadContent)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.T(this)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1368329210, i12, -1, "com.forsale.app.features.categories.home.propertyhome.models.SectionState.HandleState (SectionState.kt:25)");
            }
            if (o.d(this, d.f25086a)) {
                h11.C(164930162);
                loadContent.invoke(new e(null, null, null, null, 15, null), h11, Integer.valueOf(((i12 << 3) & 112) | 8));
                h11.S();
            } else {
                if (o.d(this, a.f25083a)) {
                    z11 = true;
                } else {
                    z11 = this instanceof b;
                }
                if (z11) {
                    h11.C(164930222);
                    h11.S();
                } else if (this instanceof f) {
                    h11.C(164930251);
                    loadContent.invoke(((f) this).b(), h11, Integer.valueOf(((i12 << 3) & 112) | 8));
                    h11.S();
                } else {
                    h11.C(164930296);
                    h11.S();
                }
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.models.SectionState$HandleState$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar2, int i15) {
                    SectionState.this.a(loadContent, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
