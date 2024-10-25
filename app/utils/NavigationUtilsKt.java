package com.forsale.app.utils;

import android.net.Uri;
import androidx.navigation.NavController;
import androidx.navigation.e;
/* compiled from: NavigationUtils.kt */
/* loaded from: classes3.dex */
public final class NavigationUtilsKt {
    public static final void a(final NavController navController, String deeplink) {
        kotlin.jvm.internal.o.i(navController, "<this>");
        kotlin.jvm.internal.o.i(deeplink, "deeplink");
        navController.Z(e.a.f13304d.a(Uri.parse(deeplink)).a(), z3.r.a(new g00.l<androidx.navigation.i, wz.p>() { // from class: com.forsale.app.utils.NavigationUtilsKt$navigateToDeepLink$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(androidx.navigation.i navOptions) {
                kotlin.jvm.internal.o.i(navOptions, "$this$navOptions");
                navOptions.c(NavController.this.H().S(), new g00.l<z3.u, wz.p>() { // from class: com.forsale.app.utils.NavigationUtilsKt$navigateToDeepLink$1.1
                    public final void b(z3.u popUpTo) {
                        kotlin.jvm.internal.o.i(popUpTo, "$this$popUpTo");
                        popUpTo.d(true);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ wz.p invoke(z3.u uVar) {
                        b(uVar);
                        return wz.p.f75480a;
                    }
                });
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(androidx.navigation.i iVar) {
                b(iVar);
                return wz.p.f75480a;
            }
        }));
    }

    public static final void b(NavController navController, String deeplink, final g00.l<? super androidx.navigation.i, wz.p> block) {
        kotlin.jvm.internal.o.i(navController, "<this>");
        kotlin.jvm.internal.o.i(deeplink, "deeplink");
        kotlin.jvm.internal.o.i(block, "block");
        navController.Z(e.a.f13304d.a(Uri.parse(deeplink)).a(), z3.r.a(new g00.l<androidx.navigation.i, wz.p>() { // from class: com.forsale.app.utils.NavigationUtilsKt$navigateToDeepLink$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void b(androidx.navigation.i navOptions) {
                kotlin.jvm.internal.o.i(navOptions, "$this$navOptions");
                block.invoke(navOptions);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(androidx.navigation.i iVar) {
                b(iVar);
                return wz.p.f75480a;
            }
        }));
    }

    public static final void c(NavController navController, z3.n navDirections, androidx.navigation.h hVar) {
        kotlin.jvm.internal.o.i(navController, "<this>");
        kotlin.jvm.internal.o.i(navDirections, "navDirections");
        try {
            navController.e0(navDirections, hVar);
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void d(NavController navController, z3.n nVar, androidx.navigation.h hVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            hVar = null;
        }
        c(navController, nVar, hVar);
    }
}
