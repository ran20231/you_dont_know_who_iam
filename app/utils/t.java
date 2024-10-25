package com.forsale.app.utils;

import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Permissions.kt */
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: d  reason: collision with root package name */
    public static final a f40536d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f40537e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final int f40538a;

    /* renamed from: b  reason: collision with root package name */
    private final String[] f40539b;

    /* renamed from: c  reason: collision with root package name */
    private u f40540c;

    /* compiled from: Permissions.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t a(int i11, String... permissions) {
            kotlin.jvm.internal.o.i(permissions, "permissions");
            return new t(i11, (String[]) Arrays.copyOf(permissions, permissions.length), null);
        }
    }

    public /* synthetic */ t(int i11, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, strArr);
    }

    public final u a(Object thisRef, n00.k<?> property) {
        u appCompatActivityPermissionsManager;
        kotlin.jvm.internal.o.i(thisRef, "thisRef");
        kotlin.jvm.internal.o.i(property, "property");
        u uVar = this.f40540c;
        if (uVar != null) {
            if (uVar == null) {
                kotlin.jvm.internal.o.w("instance");
                return null;
            }
            return uVar;
        }
        if (thisRef instanceof Fragment) {
            WeakReference weakReference = new WeakReference(thisRef);
            int i11 = this.f40538a;
            String[] strArr = this.f40539b;
            appCompatActivityPermissionsManager = new FragmentPermissionsManager(weakReference, i11, (String[]) Arrays.copyOf(strArr, strArr.length));
        } else if (thisRef instanceof androidx.appcompat.app.d) {
            WeakReference weakReference2 = new WeakReference(thisRef);
            int i12 = this.f40538a;
            String[] strArr2 = this.f40539b;
            appCompatActivityPermissionsManager = new AppCompatActivityPermissionsManager(weakReference2, i12, (String[]) Arrays.copyOf(strArr2, strArr2.length));
        } else {
            throw new TypeCastException("Can't cast " + thisRef + " to any thing because it is not supported");
        }
        this.f40540c = appCompatActivityPermissionsManager;
        return appCompatActivityPermissionsManager;
    }

    private t(int i11, String... strArr) {
        this.f40538a = i11;
        this.f40539b = strArr;
    }
}
