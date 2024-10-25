package com.forsale.app.utils;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Permissions.kt */
/* loaded from: classes3.dex */
public final class AppCompatActivityPermissionsManager extends u {

    /* renamed from: d  reason: collision with root package name */
    private final WeakReference<androidx.appcompat.app.d> f39514d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatActivityPermissionsManager(WeakReference<androidx.appcompat.app.d> activity, int i11, String... permissions) {
        super(i11, (String[]) Arrays.copyOf(permissions, permissions.length));
        kotlin.jvm.internal.o.i(activity, "activity");
        kotlin.jvm.internal.o.i(permissions, "permissions");
        this.f39514d = activity;
    }

    @Override // com.forsale.app.utils.u
    public void d(int i11, String[] permissions, int[] grantResults, g00.l<? super List<String>, wz.p> onAllDenied) {
        boolean z11;
        androidx.appcompat.app.d dVar;
        kotlin.jvm.internal.o.i(permissions, "permissions");
        kotlin.jvm.internal.o.i(grantResults, "grantResults");
        kotlin.jvm.internal.o.i(onAllDenied, "onAllDenied");
        if (grantResults.length == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && (dVar = this.f39514d.get()) != null) {
            Pair<Boolean, List<String>> c11 = c(dVar);
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
        wz.p pVar2;
        kotlin.jvm.internal.o.i(onAllGranted, "onAllGranted");
        e(onAllGranted);
        final androidx.appcompat.app.d dVar = this.f39514d.get();
        if (dVar != null) {
            Pair<Boolean, List<String>> c11 = c(dVar);
            boolean booleanValue = c11.a().booleanValue();
            final List<String> b11 = c11.b();
            if (booleanValue) {
                onAllGranted.invoke();
                return;
            }
            if (pVar != null) {
                pVar.invoke(b11, new g00.a<wz.p>() { // from class: com.forsale.app.utils.AppCompatActivityPermissionsManager$withPermission$1$1
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
                        androidx.appcompat.app.d.this.requestPermissions((String[]) b11.toArray(new String[0]), this.b());
                    }
                });
                pVar2 = wz.p.f75480a;
            } else {
                pVar2 = null;
            }
            if (pVar2 == null) {
                dVar.requestPermissions((String[]) b11.toArray(new String[0]), b());
            }
        }
    }
}
