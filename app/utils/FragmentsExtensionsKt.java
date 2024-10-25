package com.forsale.app.utils;

import androidx.fragment.app.Fragment;
/* compiled from: FragmentsExtensions.kt */
/* loaded from: classes3.dex */
public final class FragmentsExtensionsKt {
    public static final void a(Fragment fragment, z3.n navDirs) {
        kotlin.jvm.internal.o.i(fragment, "<this>");
        kotlin.jvm.internal.o.i(navDirs, "navDirs");
        NavigationUtilsKt.c(androidx.navigation.fragment.a.a(fragment), navDirs, z3.r.a(new g00.l<androidx.navigation.i, wz.p>() { // from class: com.forsale.app.utils.FragmentsExtensionsKt$navigate$1
            public final void b(androidx.navigation.i navOptions) {
                kotlin.jvm.internal.o.i(navOptions, "$this$navOptions");
                navOptions.d(true);
                navOptions.g(true);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(androidx.navigation.i iVar) {
                b(iVar);
                return wz.p.f75480a;
            }
        }));
    }

    public static final androidx.appcompat.app.d b(Fragment fragment) {
        kotlin.jvm.internal.o.i(fragment, "<this>");
        androidx.fragment.app.p requireActivity = fragment.requireActivity();
        kotlin.jvm.internal.o.g(requireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        return (androidx.appcompat.app.d) requireActivity;
    }
}
