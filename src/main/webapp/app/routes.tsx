import * as React from 'react';
import { Route, Switch } from 'react-router-dom';

import Login from './modules/login/login';
import Logout from './modules/login/logout';
import Register from './modules/account/register/register';
import Home from './modules/home/home';
import Admin from './modules/administration';
import Account from './modules/account';
import Activate from './modules/account/activate/activate';
import PasswordResetInit from './modules/account/password-reset/init/password-reset-init';
import PasswordResetFinish from './modules/account/password-reset/finish/password-reset-finish';
import Entities from './entities';
import PrivateRoute from './shared/auth/private-route';
import { AUTHORITIES } from './config/constants';

const Routes = () => (
  <div className="view-routes">
    <Route path="/login" component={Login} />
    <Switch>
      <Route path="/logout" component={Logout} />
      <Route path="/register" component={Register} />
      <Route path="/activate/:key?" component={Activate} />
      <Route path="/reset/request" component={PasswordResetInit} />
      <Route path="/reset/finish/:key?" component={PasswordResetFinish} />
      <PrivateRoute path="/admin" component={Admin} hasAnyAuthorities={[AUTHORITIES.ADMIN]} />
      <PrivateRoute path="/account" component={Account} hasAnyAuthorities={[AUTHORITIES.ADMIN, AUTHORITIES.USER]} />
      <PrivateRoute path="/entity" component={Entities} hasAnyAuthorities={[AUTHORITIES.USER]} />
      <Route path="/" component={Home} />
    </Switch>
  </div>
);

export default Routes;
