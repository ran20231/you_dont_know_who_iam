package com.forsale.app.utils;

import androidx.fragment.app.Fragment;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: LifeCycleUtils.kt */
/* loaded from: classes3.dex */
public final class LifeCycleUtilsKt {
    public static final void a(androidx.appcompat.app.d dVar, g00.l<? super zz.a<? super wz.p>, ? extends Object> block) {
        kotlin.jvm.internal.o.i(dVar, "<this>");
        kotlin.jvm.internal.o.i(block, "block");
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.t.a(dVar), null, null, new LifeCycleUtilsKt$activityScope$1(dVar, block, null), 3, null);
    }

    public static final void b(Fragment fragment, g00.l<? super zz.a<? super wz.p>, ? extends Object> block) {
        kotlin.jvm.internal.o.i(fragment, "<this>");
        kotlin.jvm.internal.o.i(block, "block");
        androidx.lifecycle.s viewLifecycleOwner = fragment.getViewLifecycleOwner();
        kotlin.jvm.internal.o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.t.a(viewLifecycleOwner), null, null, new LifeCycleUtilsKt$viewScope$1(fragment, block, null), 3, null);
    }
}
