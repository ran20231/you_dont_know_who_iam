package com.forsale.app.features.more.newprofile.followerandfollowing;

import com.forsale.app.features.more.newprofile.followerandfollowing.itemui.CTAsState;
import g00.p;
import j0.k0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FollowersAndFollowings.kt */
/* loaded from: classes2.dex */
public /* synthetic */ class FollowersAndFollowingsKt$FollowersAndFollowings$1$1$4 extends FunctionReferenceImpl implements p<String, k0<CTAsState>, wz.p> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public FollowersAndFollowingsKt$FollowersAndFollowings$1$1$4(Object obj) {
        super(2, obj, FollowersAndFollowingsViewModel.class, "onItemCTAClicked", "onItemCTAClicked(Ljava/lang/String;Landroidx/compose/runtime/MutableState;)V", 0);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(String str, k0<CTAsState> k0Var) {
        m(str, k0Var);
        return wz.p.f75480a;
    }

    public final void m(String p02, k0<CTAsState> p12) {
        o.i(p02, "p0");
        o.i(p12, "p1");
        ((FollowersAndFollowingsViewModel) this.receiver).K(p02, p12);
    }
}
