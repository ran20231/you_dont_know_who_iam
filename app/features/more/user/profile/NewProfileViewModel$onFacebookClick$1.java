package com.forsale.app.features.more.user.profile;

import com.forsale.app.datalayer.repositories.SocialMediaRepository;
import com.forsale.app.utils.analytics.LinkType;
import com.forsale.app.utils.prefUtils.preferences.SocialMediaPrefs;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.profile.NewProfileViewModel$onFacebookClick$1", f = "NewProfileViewModel.kt", l = {326, 324}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewProfileViewModel$onFacebookClick$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f33589a;

    /* renamed from: b  reason: collision with root package name */
    int f33590b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NewProfileViewModel f33591c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewProfileViewModel$onFacebookClick$1(NewProfileViewModel newProfileViewModel, zz.a<? super NewProfileViewModel$onFacebookClick$1> aVar) {
        super(2, aVar);
        this.f33591c = newProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewProfileViewModel$onFacebookClick$1(this.f33591c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        SocialMediaRepository socialMediaRepository;
        f fVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33590b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    fVar = this.f33591c.f33542c;
                    fVar.i(new yi.b(LinkType.FACEBOOK));
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableSharedFlow = (MutableSharedFlow) this.f33589a;
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            mutableSharedFlow = this.f33591c.C;
            socialMediaRepository = this.f33591c.f33548i;
            SocialMediaPrefs.SocialMediaTypes socialMediaTypes = SocialMediaPrefs.SocialMediaTypes.FACEBOOK;
            this.f33589a = mutableSharedFlow;
            this.f33590b = 1;
            obj = socialMediaRepository.getSocialMediaLink(socialMediaTypes, this);
            if (obj == f11) {
                return f11;
            }
        }
        u uVar = new u((String) obj);
        this.f33589a = null;
        this.f33590b = 2;
        if (mutableSharedFlow.emit(uVar, this) == f11) {
            return f11;
        }
        fVar = this.f33591c.f33542c;
        fVar.i(new yi.b(LinkType.FACEBOOK));
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewProfileViewModel$onFacebookClick$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
