package com.forsale.app.features.more.user.profile;

import com.forsale.app.datalayer.repositories.SocialMediaRepository;
import com.forsale.app.utils.analytics.LinkType;
import com.forsale.app.utils.prefUtils.preferences.SocialMediaPrefs;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.profile.NewProfileViewModel$onTwitterClick$1", f = "NewProfileViewModel.kt", l = {337, 335}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewProfileViewModel$onTwitterClick$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f33633a;

    /* renamed from: b  reason: collision with root package name */
    int f33634b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NewProfileViewModel f33635c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewProfileViewModel$onTwitterClick$1(NewProfileViewModel newProfileViewModel, zz.a<? super NewProfileViewModel$onTwitterClick$1> aVar) {
        super(2, aVar);
        this.f33635c = newProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewProfileViewModel$onTwitterClick$1(this.f33635c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        SocialMediaRepository socialMediaRepository;
        f fVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33634b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    fVar = this.f33635c.f33542c;
                    fVar.i(new yi.b(LinkType.TWITTER));
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableSharedFlow = (MutableSharedFlow) this.f33633a;
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            mutableSharedFlow = this.f33635c.C;
            socialMediaRepository = this.f33635c.f33548i;
            SocialMediaPrefs.SocialMediaTypes socialMediaTypes = SocialMediaPrefs.SocialMediaTypes.TWITTER;
            this.f33633a = mutableSharedFlow;
            this.f33634b = 1;
            obj = socialMediaRepository.getSocialMediaLink(socialMediaTypes, this);
            if (obj == f11) {
                return f11;
            }
        }
        w wVar = new w((String) obj);
        this.f33633a = null;
        this.f33634b = 2;
        if (mutableSharedFlow.emit(wVar, this) == f11) {
            return f11;
        }
        fVar = this.f33635c.f33542c;
        fVar.i(new yi.b(LinkType.TWITTER));
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewProfileViewModel$onTwitterClick$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
