package com.forsale.app.datalayer.network.services;

import com.forsale.app.datalayer.network.entities.BlockingReasonEntity;
import com.forsale.app.datalayer.network.entities.CancelUserAutoRepostsEntity;
import com.forsale.app.datalayer.network.entities.GetUserAutoRepostsEntity;
import com.forsale.app.datalayer.network.entities.SessionEntity;
import com.forsale.app.datalayer.network.requestsbodies.BlockingReasonBody;
import com.forsale.app.datalayer.network.requestsbodies.CancelUserAutoRepostsBody;
import com.forsale.app.datalayer.network.requestsbodies.GetUserAutoRepostsBody;
import com.forsale.app.datalayer.network.requestsbodies.LoginBody;
import com.forsale.app.datalayer.network.requestsbodies.LogoutBody;
import com.forsale.app.datalayer.network.requestsbodies.RegistrationBody;
import com.forsale.app.datalayer.network.requestsbodies.SetLastActivityBody;
import com.forsale.app.datalayer.network.requestsbodies.SetPasswordBody;
import i10.a;
import i10.o;
/* compiled from: UserService.kt */
/* loaded from: classes2.dex */
public interface UserService {
    @o("Users/cancelUserAutoReposts")
    Object cancelUserAutoReposts(@a CancelUserAutoRepostsBody cancelUserAutoRepostsBody, zz.a<? super CancelUserAutoRepostsEntity> aVar);

    @o("Users/getBlockReason")
    Object getBlockingReason(@a BlockingReasonBody blockingReasonBody, zz.a<? super BlockingReasonEntity> aVar);

    @o("Users/getUserAutoReposts")
    Object getUserAutoReposts(@a GetUserAutoRepostsBody getUserAutoRepostsBody, zz.a<? super GetUserAutoRepostsEntity> aVar);

    @o("Users/login")
    Object login(@a LoginBody loginBody, zz.a<? super SessionEntity> aVar);

    @o("Users/logout")
    Object logoutAsync(@a LogoutBody logoutBody, zz.a<? super SessionEntity> aVar);

    @o("Users/logoutAllDevices")
    Object logoutFromAllDevices(@a LogoutBody logoutBody, zz.a<? super SessionEntity> aVar);

    @o("Users/register")
    Object register(@a RegistrationBody registrationBody, zz.a<? super SessionEntity> aVar);

    @o("Users/setLastActivity")
    Object setLastActivity(@a SetLastActivityBody setLastActivityBody, zz.a<? super Boolean> aVar);

    @o("Users/setPassword")
    Object setPassword(@a SetPasswordBody setPasswordBody, zz.a<? super SessionEntity> aVar);
}
