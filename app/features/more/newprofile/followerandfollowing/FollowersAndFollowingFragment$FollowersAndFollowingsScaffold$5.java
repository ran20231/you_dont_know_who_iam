package com.forsale.app.features.more.newprofile.followerandfollowing;

import com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel;
import g00.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import wz.p;
/* compiled from: FollowersAndFollowingFragment.kt */
/* loaded from: classes2.dex */
/* synthetic */ class FollowersAndFollowingFragment$FollowersAndFollowingsScaffold$5 extends FunctionReferenceImpl implements l<Boolean, p> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public FollowersAndFollowingFragment$FollowersAndFollowingsScaffold$5(Object obj) {
        super(1, obj, SettingsViewModel.class, "showSettingsBottomSheet", "showSettingsBottomSheet(Z)V", 0);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(Boolean bool) {
        m(bool.booleanValue());
        return p.f75480a;
    }

    public final void m(boolean z11) {
        ((SettingsViewModel) this.receiver).s(z11);
    }
}
