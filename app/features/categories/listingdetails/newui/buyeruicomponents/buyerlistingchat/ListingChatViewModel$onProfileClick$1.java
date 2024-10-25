package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat;

import com.forsale.app.features.categories.user.profile.UserProfileData;
import com.forsale.app.utils.OneShotEventHandler;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingChatViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.ListingChatViewModel$onProfileClick$1", f = "ListingChatViewModel.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingChatViewModel$onProfileClick$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27370a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListingChatViewModel f27371b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingChatViewModel$onProfileClick$1(ListingChatViewModel listingChatViewModel, zz.a<? super ListingChatViewModel$onProfileClick$1> aVar) {
        super(2, aVar);
        this.f27371b = listingChatViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ListingChatViewModel$onProfileClick$1(this.f27371b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f27370a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            OneShotEventHandler<UserProfileData> B0 = this.f27371b.B0();
            UserProfileData C0 = this.f27371b.C0();
            this.f27370a = 1;
            if (B0.f(C0, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ListingChatViewModel$onProfileClick$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
