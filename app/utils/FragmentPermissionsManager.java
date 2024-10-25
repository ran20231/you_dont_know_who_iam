package com.forsale.app.utils;

import android.content.Context;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Permissions.kt */
/* loaded from: classes3.dex */
public final class FragmentPermissionsManager extends u {

    /* renamed from: d  reason: collision with root package name */
    private final WeakReference<Fragment> f39561d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentPermissionsManager(WeakReference<Fragment> fragment, int i11, String... permissions) {
        super(i11, (String[]) Arrays.copyOf(permissions, permissions.length));
        kotlin.jvm.internal.o.i(fragment, "fragment");
        kotlin.jvm.internal.o.i(permissions, "permissions");
        this.f39561d = fragment;
    }

    @Override // com.forsale.app.utils.u
    public void d(int i11, String[] permissions, int[] grantResults, g00.l<? super List<String>, wz.p> onAllDenied) {
        boolean z11;
        Fragment fragment;
        Context context;
        kotlin.jvm.internal.o.i(permissions, "permissions");
        kotlin.jvm.internal.o.i(grantResults, "grantResults");
        kotlin.jvm.internal.o.i(onAllDenied, "onAllDenied");
        if (grantResults.length == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && (fragment = this.f39561d.get()) != null && (context = fragment.getContext()) != null) {
            Pair<Boolean, List<String>> c11 = c(context);
            boolean booleanValue = c11.a().booleanValue();
            List<String> b11 = c11.b();
            if (i11 == b() && booleanValue) {
                a().invoke();
            } else if (i11 == b()) {
                onAllDenied.invoke(b11);
            }
        }
    }

    @Override // com.forsale.app.utils.u
    public void f(g00.p<? super List<String>, ? super g00.a<wz.p>, wz.p> pVar, g00.a<wz.p> onAllGranted) {
        Context context;
        kotlin.jvm.internal.o.i(onAllGranted, "onAllGranted");
        e(onAllGranted);
        Fragment fragment = this.f39561d.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            Pair<Boolean, List<String>> c11 = c(context);
            boolean booleanValue = c11.a().booleanValue();
            final List<String> b11 = c11.b();
            if (booleanValue) {
                onAllGranted.invoke();
            } else if (pVar != null) {
                pVar.invoke(b11, new g00.a<wz.p>() { // from class: com.forsale.app.utils.FragmentPermissionsManager$withPermission$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ wz.p invoke() {
                        invoke2();
                        return wz.p.f75480a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        WeakReference weakReference;
                        weakReference = FragmentPermissionsManager.this.f39561d;
                        Fragment fragment2 = (Fragment) weakReference.get();
                        if (fragment2 != null) {
                            fragment2.requestPermissions((String[]) b11.toArray(new String[0]), FragmentPermissionsManager.this.b());
                        }
                    }
                });
            } else {
                Fragment fragment2 = this.f39561d.get();
                if (fragment2 != null) {
                    fragment2.requestPermissions((String[]) b11.toArray(new String[0]), b());
                }
            }
        }
    }
}
