package com.forsale.app.features.categories.listingdetails.buyerscreen.media;

import cb.c;
import com.forsale.app.features.categories.listingdetails.ShareText;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import com.leanplum.internal.ResourceQualifiers;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MediaDialogViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialogViewModel$onShareClicked$1$1", f = "MediaDialogViewModel.kt", l = {ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_MASK, 193}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MediaDialogViewModel$onShareClicked$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f26217a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MediaDialogViewModel f26218b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ShareText f26219c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaDialogViewModel$onShareClicked$1$1(MediaDialogViewModel mediaDialogViewModel, ShareText shareText, zz.a<? super MediaDialogViewModel$onShareClicked$1$1> aVar) {
        super(2, aVar);
        this.f26218b = mediaDialogViewModel;
        this.f26219c = shareText;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MediaDialogViewModel$onShareClicked$1$1(this.f26218b, this.f26219c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object O;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f26217a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            MediaDialogViewModel mediaDialogViewModel = this.f26218b;
            DetailsModel A = mediaDialogViewModel.A();
            this.f26217a = 1;
            O = mediaDialogViewModel.O(A, this);
            if (O == f11) {
                return f11;
            }
        }
        mutableSharedFlow = this.f26218b.G;
        c.d dVar = new c.d(this.f26219c);
        this.f26217a = 2;
        if (mutableSharedFlow.emit(dVar, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MediaDialogViewModel$onShareClicked$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
