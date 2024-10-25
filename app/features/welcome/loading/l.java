package com.forsale.app.features.welcome.loading;

import android.os.Bundle;
import android.os.Parcelable;
import com.forsale.app.datalayer.network.entities.SessionEntity;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import t9.r0;
/* compiled from: SplashFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final b f37396a = new b(null);

    /* compiled from: SplashFragmentDirections.kt */
    /* loaded from: classes2.dex */
    private static final class a implements z3.n {

        /* renamed from: a  reason: collision with root package name */
        private final SessionEntity.AppStatus f37397a;

        /* renamed from: b  reason: collision with root package name */
        private final int f37398b;

        public a() {
            this(null, 1, null);
        }

        @Override // z3.n
        public int a() {
            return this.f37398b;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(SessionEntity.AppStatus.class)) {
                SessionEntity.AppStatus appStatus = this.f37397a;
                o.g(appStatus, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("appStatus", (Parcelable) appStatus);
            } else if (Serializable.class.isAssignableFrom(SessionEntity.AppStatus.class)) {
                SessionEntity.AppStatus appStatus2 = this.f37397a;
                o.g(appStatus2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("appStatus", appStatus2);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f37397a == ((a) obj).f37397a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f37397a.hashCode();
        }

        public String toString() {
            SessionEntity.AppStatus appStatus = this.f37397a;
            return "ActionLoadingFragmentToAppStatusFragment(appStatus=" + appStatus + ")";
        }

        public a(SessionEntity.AppStatus appStatus) {
            o.i(appStatus, "appStatus");
            this.f37397a = appStatus;
            this.f37398b = r0.D;
        }

        public /* synthetic */ a(SessionEntity.AppStatus appStatus, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? SessionEntity.AppStatus.OPTIONAL_UPDATE : appStatus);
        }
    }

    /* compiled from: SplashFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z3.n a(SessionEntity.AppStatus appStatus) {
            o.i(appStatus, "appStatus");
            return new a(appStatus);
        }

        public final z3.n b() {
            return new z3.a(r0.E);
        }

        public final z3.n c() {
            return new z3.a(r0.F);
        }

        public final z3.n d() {
            return new z3.a(r0.G);
        }

        public final z3.n e() {
            return new z3.a(r0.H);
        }
    }
}
