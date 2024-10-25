package com.forsale.app.features.categories.listingdetails.buyerscreen.media;

import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.UserContactMode;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MediaDialogViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialogViewModel$openCTAsBottomSheet$1", f = "MediaDialogViewModel.kt", l = {214}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MediaDialogViewModel$openCTAsBottomSheet$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f26226a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MediaDialogViewModel f26227b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DetailsModel f26228c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ UserContactMode f26229d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaDialogViewModel$openCTAsBottomSheet$1(MediaDialogViewModel mediaDialogViewModel, DetailsModel detailsModel, UserContactMode userContactMode, zz.a<? super MediaDialogViewModel$openCTAsBottomSheet$1> aVar) {
        super(2, aVar);
        this.f26227b = mediaDialogViewModel;
        this.f26228c = detailsModel;
        this.f26229d = userContactMode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MediaDialogViewModel$openCTAsBottomSheet$1(this.f26227b, this.f26228c, this.f26229d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f26226a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f26227b.K;
            ab.a aVar = new ab.a(this.f26229d, true, this.f26228c.d().l());
            this.f26226a = 1;
            if (mutableStateFlow.emit(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MediaDialogViewModel$openCTAsBottomSheet$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
